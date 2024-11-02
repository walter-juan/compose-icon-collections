package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.EnvelopeOpen: ImageVector
    get() {
        if (_envelopeOpen != null) {
            return _envelopeOpen!!
        }
        _envelopeOpen = Builder(name = "EnvelopeOpen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.75f, 9.0f)
                verticalLineTo(9.906f)
                curveTo(21.75f, 10.734f, 21.295f, 11.495f, 20.567f, 11.887f)
                lineTo(14.089f, 15.375f)
                moveTo(2.25f, 9.0f)
                verticalLineTo(9.906f)
                curveTo(2.25f, 10.734f, 2.704f, 11.495f, 3.433f, 11.887f)
                lineTo(9.911f, 15.375f)
                moveTo(18.75f, 17.885f)
                lineTo(14.089f, 15.375f)
                moveTo(14.089f, 15.375f)
                lineTo(13.067f, 14.824f)
                curveTo(12.401f, 14.466f, 11.599f, 14.466f, 10.933f, 14.824f)
                lineTo(9.911f, 15.375f)
                moveTo(9.911f, 15.375f)
                lineTo(5.25f, 17.885f)
                moveTo(21.75f, 19.5f)
                curveTo(21.75f, 20.743f, 20.743f, 21.75f, 19.5f, 21.75f)
                horizontalLineTo(4.5f)
                curveTo(3.257f, 21.75f, 2.25f, 20.743f, 2.25f, 19.5f)
                lineTo(2.25f, 8.844f)
                curveTo(2.25f, 8.016f, 2.704f, 7.255f, 3.433f, 6.863f)
                lineTo(10.933f, 2.824f)
                curveTo(11.599f, 2.466f, 12.401f, 2.466f, 13.067f, 2.824f)
                lineTo(20.567f, 6.863f)
                curveTo(21.295f, 7.255f, 21.75f, 8.016f, 21.75f, 8.844f)
                verticalLineTo(19.5f)
                close()
            }
        }
        .build()
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null

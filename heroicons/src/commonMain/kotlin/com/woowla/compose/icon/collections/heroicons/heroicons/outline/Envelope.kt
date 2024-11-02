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

public val OutlineGroup.Envelope: ImageVector
    get() {
        if (_envelope != null) {
            return _envelope!!
        }
        _envelope = Builder(name = "Envelope", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.75f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(21.75f, 18.493f, 20.743f, 19.5f, 19.5f, 19.5f)
                horizontalLineTo(4.5f)
                curveTo(3.257f, 19.5f, 2.25f, 18.493f, 2.25f, 17.25f)
                verticalLineTo(6.75f)
                moveTo(21.75f, 6.75f)
                curveTo(21.75f, 5.507f, 20.743f, 4.5f, 19.5f, 4.5f)
                horizontalLineTo(4.5f)
                curveTo(3.257f, 4.5f, 2.25f, 5.507f, 2.25f, 6.75f)
                moveTo(21.75f, 6.75f)
                verticalLineTo(6.993f)
                curveTo(21.75f, 7.774f, 21.345f, 8.499f, 20.679f, 8.909f)
                lineTo(13.179f, 13.524f)
                curveTo(12.456f, 13.969f, 11.544f, 13.969f, 10.821f, 13.524f)
                lineTo(3.321f, 8.909f)
                curveTo(2.655f, 8.499f, 2.25f, 7.774f, 2.25f, 6.993f)
                verticalLineTo(6.75f)
            }
        }
        .build()
        return _envelope!!
    }

private var _envelope: ImageVector? = null

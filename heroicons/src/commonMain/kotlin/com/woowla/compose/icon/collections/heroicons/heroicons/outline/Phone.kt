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

public val OutlineGroup.Phone: ImageVector
    get() {
        if (_phone != null) {
            return _phone!!
        }
        _phone = Builder(name = "Phone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.25f, 6.75f)
                curveTo(2.25f, 15.034f, 8.966f, 21.75f, 17.25f, 21.75f)
                horizontalLineTo(19.5f)
                curveTo(20.743f, 21.75f, 21.75f, 20.743f, 21.75f, 19.5f)
                verticalLineTo(18.128f)
                curveTo(21.75f, 17.612f, 21.399f, 17.162f, 20.898f, 17.037f)
                lineTo(16.475f, 15.931f)
                curveTo(16.035f, 15.821f, 15.573f, 15.986f, 15.302f, 16.348f)
                lineTo(14.332f, 17.641f)
                curveTo(14.05f, 18.017f, 13.563f, 18.183f, 13.122f, 18.021f)
                curveTo(9.815f, 16.81f, 7.19f, 14.185f, 5.979f, 10.878f)
                curveTo(5.817f, 10.437f, 5.983f, 9.95f, 6.359f, 9.668f)
                lineTo(7.652f, 8.698f)
                curveTo(8.015f, 8.427f, 8.179f, 7.964f, 8.069f, 7.525f)
                lineTo(6.963f, 3.102f)
                curveTo(6.838f, 2.601f, 6.388f, 2.25f, 5.872f, 2.25f)
                horizontalLineTo(4.5f)
                curveTo(3.257f, 2.25f, 2.25f, 3.257f, 2.25f, 4.5f)
                verticalLineTo(6.75f)
                close()
            }
        }
        .build()
        return _phone!!
    }

private var _phone: ImageVector? = null

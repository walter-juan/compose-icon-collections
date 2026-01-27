package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.Wpforms: ImageVector
    get() {
        if (_wpforms != null) {
            return _wpforms!!
        }
        _wpforms = Builder(name = "Wpforms", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 75.2f)
                lineToRelative(0.0f, 361.7f)
                curveToRelative(0.0f, 24.3f, -19.0f, 43.2f, -43.2f, 43.2f)
                lineToRelative(-361.6f, 0.0f)
                curveTo(19.3f, 480.0f, 0.0f, 461.4f, 0.0f, 436.8f)
                lineTo(0.0f, 75.2f)
                curveTo(0.0f, 51.1f, 18.8f, 32.0f, 43.2f, 32.0f)
                lineToRelative(361.7f, 0.0f)
                curveToRelative(24.0f, 0.0f, 43.1f, 18.8f, 43.1f, 43.2f)
                close()
                moveTo(410.7f, 436.8f)
                lineToRelative(0.0f, -361.6f)
                curveToRelative(0.0f, -3.0f, -2.6f, -5.8f, -5.8f, -5.8f)
                lineToRelative(-9.3f, 0.0f)
                lineToRelative(-110.3f, 74.6f)
                lineToRelative(-61.3f, -49.9f)
                lineToRelative(-61.2f, 49.9f)
                lineToRelative(-110.3f, -74.7f)
                lineToRelative(-9.3f, 0.0f)
                curveToRelative(-3.2f, 0.0f, -5.8f, 2.8f, -5.8f, 5.8f)
                lineToRelative(0.0f, 361.7f)
                curveToRelative(0.0f, 3.0f, 2.6f, 5.8f, 5.8f, 5.8f)
                lineToRelative(361.7f, 0.0f)
                curveToRelative(3.2f, 0.1f, 5.8f, -2.7f, 5.8f, -5.8f)
                close()
                moveTo(150.2f, 186.0f)
                lineToRelative(0.0f, 37.0f)
                lineToRelative(-73.5f, 0.0f)
                lineToRelative(0.0f, -37.0f)
                lineToRelative(73.5f, 0.0f)
                close()
                moveTo(150.2f, 260.4f)
                lineToRelative(0.0f, 37.3f)
                lineToRelative(-73.5f, 0.0f)
                lineToRelative(0.0f, -37.3f)
                lineToRelative(73.5f, 0.0f)
                close()
                moveTo(161.3f, 113.1f)
                lineToRelative(54.0f, -43.7f)
                lineToRelative(-118.5f, 0.0f)
                lineToRelative(64.5f, 43.7f)
                close()
                moveTo(371.3f, 186.0f)
                lineToRelative(0.0f, 37.0f)
                lineToRelative(-196.0f, 0.0f)
                lineToRelative(0.0f, -37.0f)
                lineToRelative(196.0f, 0.0f)
                close()
                moveTo(371.3f, 260.4f)
                lineToRelative(0.0f, 37.3f)
                lineToRelative(-196.0f, 0.0f)
                lineToRelative(0.0f, -37.3f)
                lineToRelative(196.0f, 0.0f)
                close()
                moveTo(286.7f, 113.1f)
                lineToRelative(64.5f, -43.7f)
                lineToRelative(-118.4f, 0.0f)
                lineToRelative(53.9f, 43.7f)
                close()
                moveTo(371.3f, 335.0f)
                lineToRelative(0.0f, 37.3f)
                lineToRelative(-99.4f, 0.0f)
                lineToRelative(0.0f, -37.3f)
                lineToRelative(99.4f, 0.0f)
                close()
            }
        }
        .build()
        return _wpforms!!
    }

private var _wpforms: ImageVector? = null

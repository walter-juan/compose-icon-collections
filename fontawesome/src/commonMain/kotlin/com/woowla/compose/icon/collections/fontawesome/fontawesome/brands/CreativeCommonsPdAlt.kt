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

public val BrandsGroup.CreativeCommonsPdAlt: ImageVector
    get() {
        if (_creativeCommonsPdAlt != null) {
            return _creativeCommonsPdAlt!!
        }
        _creativeCommonsPdAlt = Builder(name = "CreativeCommonsPdAlt", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(255.6f, 8.0f)
                curveTo(112.7f, 8.0f, 8.0f, 123.1f, 8.0f, 256.0f)
                curveTo(8.0f, 394.5f, 121.6f, 504.0f, 255.6f, 504.0f)
                curveTo(385.5f, 504.0f, 504.0f, 403.1f, 504.0f, 256.0f)
                curveTo(504.0f, 118.1f, 397.4f, 8.0f, 255.6f, 8.0f)
                close()
                moveTo(256.4f, 458.8f)
                curveToRelative(-112.5f, 0.0f, -203.7f, -93.0f, -203.7f, -202.8f)
                curveToRelative(0.0f, -105.4f, 85.5f, -203.3f, 203.7f, -203.3f)
                curveToRelative(112.6f, 0.0f, 202.9f, 89.5f, 202.8f, 203.3f)
                curveToRelative(0.0f, 121.7f, -99.6f, 202.8f, -202.8f, 202.8f)
                close()
                moveTo(324.7f, 186.0f)
                lineToRelative(-53.2f, 0.0f)
                lineToRelative(0.0f, 137.2f)
                lineToRelative(53.2f, 0.0f)
                curveToRelative(21.4f, 0.0f, 70.0f, -5.1f, 70.0f, -68.6f)
                curveToRelative(0.0f, -63.4f, -48.6f, -68.6f, -70.0f, -68.6f)
                close()
                moveTo(325.5f, 294.5f)
                lineToRelative(-19.9f, 0.0f)
                lineToRelative(0.0f, -79.7f)
                lineToRelative(19.4f, -0.1f)
                curveToRelative(3.8f, 0.0f, 35.0f, -2.1f, 35.0f, 39.9f)
                curveToRelative(0.0f, 24.6f, -10.5f, 39.9f, -34.5f, 39.9f)
                close()
                moveTo(211.7f, 186.0f)
                lineToRelative(-68.2f, 0.0f)
                lineToRelative(0.0f, 137.3f)
                lineToRelative(34.6f, 0.0f)
                lineToRelative(0.0f, -44.3f)
                lineToRelative(27.0f, 0.0f)
                curveToRelative(54.1f, 0.0f, 57.1f, -37.5f, 57.1f, -46.5f)
                curveToRelative(0.0f, -31.0f, -16.8f, -46.5f, -50.5f, -46.5f)
                close()
                moveTo(206.8f, 253.3f)
                lineToRelative(-29.2f, 0.0f)
                lineToRelative(0.0f, -41.6f)
                lineToRelative(28.3f, 0.0f)
                curveToRelative(30.9f, 0.0f, 28.8f, 41.6f, 0.9f, 41.6f)
                close()
            }
        }
        .build()
        return _creativeCommonsPdAlt!!
    }

private var _creativeCommonsPdAlt: ImageVector? = null

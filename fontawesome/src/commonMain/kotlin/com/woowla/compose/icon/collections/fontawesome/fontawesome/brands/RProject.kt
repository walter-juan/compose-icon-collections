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

public val BrandsGroup.RProject: ImageVector
    get() {
        if (_rProject != null) {
            return _rProject!!
        }
        _rProject = Builder(name = "RProject", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(578.5f, 226.6f)
                curveTo(578.5f, 119.1f, 448.4f, 32.0f, 288.0f, 32.0f)
                reflectiveCurveTo(-2.5f, 119.1f, -2.5f, 226.6f)
                curveToRelative(0.0f, 95.8f, 103.3f, 175.4f, 239.4f, 191.5f)
                lineToRelative(0.0f, 61.9f)
                lineToRelative(99.1f, 0.0f)
                lineToRelative(0.0f, -61.5f)
                curveToRelative(24.3f, -2.7f, 47.6f, -7.4f, 69.4f, -13.9f)
                lineToRelative(40.1f, 75.4f)
                lineToRelative(112.0f, 0.0f)
                lineToRelative(-67.4f, -113.7f)
                curveToRelative(54.5f, -35.4f, 88.4f, -84.9f, 88.4f, -139.7f)
                close()
                moveTo(111.7f, 241.1f)
                curveToRelative(0.0f, -73.5f, 98.9f, -133.0f, 220.8f, -133.0f)
                reflectiveCurveToRelative(211.9f, 40.7f, 211.9f, 133.0f)
                curveToRelative(0.0f, 50.1f, -26.5f, 85.0f, -70.3f, 106.4f)
                curveToRelative(-2.4f, -1.6f, -4.7f, -2.9f, -6.4f, -3.7f)
                curveToRelative(-10.2f, -5.2f, -27.8f, -10.5f, -27.8f, -10.5f)
                reflectiveCurveToRelative(86.6f, -6.4f, 86.6f, -92.7f)
                reflectiveCurveToRelative(-90.6f, -87.9f, -90.6f, -87.9f)
                lineToRelative(-199.0f, 0.0f)
                lineToRelative(0.0f, 208.3f)
                curveToRelative(-74.1f, -21.5f, -125.2f, -67.1f, -125.2f, -119.9f)
                close()
                moveTo(336.8f, 279.4f)
                lineToRelative(0.0f, -55.6f)
                curveToRelative(57.8f, 0.0f, 87.8f, -6.8f, 87.8f, 27.3f)
                curveToRelative(0.0f, 36.5f, -38.2f, 28.3f, -87.8f, 28.3f)
                close()
                moveTo(335.9f, 351.9f)
                lineToRelative(26.6f, 0.0f)
                curveToRelative(10.8f, 0.0f, 18.9f, 11.7f, 24.0f, 19.2f)
                curveToRelative(-16.1f, 1.9f, -33.0f, 2.8f, -50.6f, 2.9f)
                lineToRelative(0.0f, -22.1f)
                close()
            }
        }
        .build()
        return _rProject!!
    }

private var _rProject: ImageVector? = null

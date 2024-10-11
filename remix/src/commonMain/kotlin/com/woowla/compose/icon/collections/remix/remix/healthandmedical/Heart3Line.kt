package com.woowla.compose.icon.collections.remix.remix.healthandmedical

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.HealthAndMedicalGroup

public val HealthAndMedicalGroup.Heart3Line: ImageVector
    get() {
        if (_heart3Line != null) {
            return _heart3Line!!
        }
        _heart3Line = Builder(name = "Heart3Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 3.0f)
                curveTo(19.538f, 3.0f, 22.0f, 5.5f, 22.0f, 9.0f)
                curveTo(22.0f, 16.0f, 14.5f, 20.0f, 12.0f, 21.5f)
                curveTo(9.5f, 20.0f, 2.0f, 16.0f, 2.0f, 9.0f)
                curveTo(2.0f, 5.5f, 4.5f, 3.0f, 7.5f, 3.0f)
                curveTo(9.36f, 3.0f, 11.0f, 4.0f, 12.0f, 5.0f)
                curveTo(13.0f, 4.0f, 14.64f, 3.0f, 16.5f, 3.0f)
                close()
                moveTo(12.934f, 18.604f)
                curveTo(13.816f, 18.049f, 14.61f, 17.496f, 15.355f, 16.903f)
                curveTo(18.334f, 14.533f, 20.0f, 11.943f, 20.0f, 9.0f)
                curveTo(20.0f, 6.641f, 18.463f, 5.0f, 16.5f, 5.0f)
                curveTo(15.424f, 5.0f, 14.259f, 5.569f, 13.414f, 6.414f)
                lineTo(12.0f, 7.828f)
                lineTo(10.586f, 6.414f)
                curveTo(9.741f, 5.569f, 8.576f, 5.0f, 7.5f, 5.0f)
                curveTo(5.559f, 5.0f, 4.0f, 6.656f, 4.0f, 9.0f)
                curveTo(4.0f, 11.943f, 5.666f, 14.533f, 8.645f, 16.903f)
                curveTo(9.39f, 17.496f, 10.184f, 18.049f, 11.066f, 18.604f)
                curveTo(11.365f, 18.792f, 11.661f, 18.973f, 12.0f, 19.175f)
                curveTo(12.339f, 18.973f, 12.635f, 18.792f, 12.934f, 18.604f)
                close()
            }
        }
        .build()
        return _heart3Line!!
    }

private var _heart3Line: ImageVector? = null

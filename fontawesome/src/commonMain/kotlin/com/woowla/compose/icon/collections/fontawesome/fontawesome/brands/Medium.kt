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

public val BrandsGroup.Medium: ImageVector
    get() {
        if (_medium != null) {
            return _medium!!
        }
        _medium = Builder(name = "Medium", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.5f, 74.26f)
                curveTo(80.81f, 74.26f, 0.0f, 155.63f, 0.0f, 256.0f)
                reflectiveCurveTo(80.82f, 437.74f, 180.5f, 437.74f)
                reflectiveCurveTo(361.0f, 356.37f, 361.0f, 256.0f)
                reflectiveCurveTo(280.19f, 74.26f, 180.5f, 74.26f)
                close()
                moveTo(468.75f, 84.91f)
                curveToRelative(-49.85f, 0.0f, -90.25f, 76.62f, -90.25f, 171.1f)
                reflectiveCurveToRelative(40.41f, 171.1f, 90.25f, 171.1f)
                reflectiveCurveToRelative(90.25f, -76.62f, 90.25f, -171.1f)
                lineTo(559.0f, 256.0f)
                curveTo(559.0f, 161.5f, 518.6f, 84.91f, 468.75f, 84.91f)
                close()
                moveTo(608.26f, 102.73f)
                curveToRelative(-17.53f, 0.0f, -31.74f, 68.63f, -31.74f, 153.27f)
                reflectiveCurveToRelative(14.2f, 153.27f, 31.74f, 153.27f)
                reflectiveCurveTo(640.0f, 340.63f, 640.0f, 256.0f)
                curveTo(640.0f, 171.35f, 625.78f, 102.73f, 608.26f, 102.73f)
                close()
            }
        }
        .build()
        return _medium!!
    }

private var _medium: ImageVector? = null

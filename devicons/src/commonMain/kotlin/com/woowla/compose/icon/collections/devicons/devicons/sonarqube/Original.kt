package com.woowla.compose.icon.collections.devicons.devicons.sonarqube

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.SonarqubeGroup

public val SonarqubeGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF549dd0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(113.19f, 125.94f)
                horizontalLineToRelative(-7.16f)
                curveTo(106.03f, 68.29f, 58.46f, 21.4f, 0.0f, 21.4f)
                verticalLineToRelative(-7.16f)
                curveToRelative(62.42f, 0.0f, 113.19f, 50.11f, 113.19f, 111.7f)
                close()
                moveTo(118.14f, 87.5f)
                curveToRelative(-8.6f, -36.15f, -37.9f, -66.36f, -74.62f, -76.9f)
                lineToRelative(1.65f, -5.74f)
                curveToRelative(38.76f, 11.13f, 69.7f, 43.03f, 78.78f, 81.26f)
                close()
                moveTo(123.65f, 53.56f)
                curveToRelative(-8.85f, -19.31f, -23.94f, -36.15f, -42.48f, -47.41f)
                lineToRelative(2.48f, -4.08f)
                curveTo(102.99f, 13.82f, 118.74f, 31.4f, 128.0f, 51.56f)
                close()
                moveTo(123.65f, 53.56f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null

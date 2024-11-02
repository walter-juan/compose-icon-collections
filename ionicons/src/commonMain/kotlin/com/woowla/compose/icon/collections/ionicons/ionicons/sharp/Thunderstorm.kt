package com.woowla.compose.icon.collections.ionicons.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.ionicons.ionicons.SharpGroup

public val SharpGroup.Thunderstorm: ImageVector
    get() {
        if (_thunderstorm != null) {
            return _thunderstorm!!
        }
        _thunderstorm = Builder(name = "Thunderstorm", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(405.84f, 136.9f)
                arcTo(151.25f, 151.25f, 0.0f, false, false, 358.24f, 55.0f)
                arcToRelative(153.0f, 153.0f, 0.0f, false, false, -241.81f, 51.86f)
                curveTo(60.5f, 110.16f, 16.0f, 156.65f, 16.0f, 213.33f)
                curveTo(16.0f, 272.15f, 63.91f, 320.0f, 122.8f, 320.0f)
                horizontalLineToRelative(72.31f)
                lineTo(176.0f, 416.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(80.0f)
                lineTo(336.0f, 352.0f)
                horizontalLineTo(292.49f)
                lineToRelative(8.0f, -32.0f)
                horizontalLineTo(404.33f)
                arcToRelative(91.56f, 91.56f, 0.0f, false, false, 1.51f, -183.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(74.53f, 407.18f)
                lineToRelative(38.32f, -76.62f)
                lineToRelative(28.62f, 14.31f)
                lineToRelative(-38.32f, 76.62f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(98.52f, 471.19f)
                lineToRelative(30.32f, -60.62f)
                lineToRelative(28.62f, 14.31f)
                lineToRelative(-30.32f, 60.62f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(354.54f, 407.19f)
                lineToRelative(38.32f, -76.62f)
                lineToRelative(28.62f, 14.31f)
                lineToRelative(-38.32f, 76.62f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(378.54f, 471.2f)
                lineToRelative(30.32f, -60.62f)
                lineToRelative(28.62f, 14.31f)
                lineToRelative(-30.32f, 60.62f)
                close()
            }
        }
        .build()
        return _thunderstorm!!
    }

private var _thunderstorm: ImageVector? = null

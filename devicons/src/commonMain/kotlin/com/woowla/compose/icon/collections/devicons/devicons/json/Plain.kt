package com.woowla.compose.icon.collections.devicons.devicons.json

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.woowla.compose.icon.collections.devicons.devicons.JsonGroup

public val JsonGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF505050)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(45.95f, 63.71f)
                curveToRelative(0.0f, 23.0f, 17.85f, 30.04f, 18.22f, 30.17f)
                lineToRelative(0.02f, 0.0f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, false, -0.05f, 0.02f)
                horizontalLineToRelative(-0.0f)
                verticalLineToRelative(0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(20.31f, 6.9f, 40.67f, -10.26f, 40.67f, -41.25f)
                curveToRelative(0.0f, -17.05f, -7.59f, -37.36f, -27.7f, -48.89f)
                curveTo(105.53f, 10.08f, 126.0f, 34.39f, 126.0f, 63.9f)
                curveToRelative(0.0f, 35.82f, -30.18f, 62.0f, -61.87f, 62.0f)
                curveToRelative(-2.08f, 0.0f, -37.08f, -10.94f, -37.22f, -51.16f)
                curveToRelative(-0.1f, -30.18f, 19.21f, -40.41f, 32.72f, -38.44f)
                curveToRelative(0.01f, 0.0f, -13.68f, 7.81f, -13.68f, 27.41f)
                close()
            }
            path(fill = SolidColor(Color(0xFF505050)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(82.05f, 64.29f)
                curveToRelative(0.0f, -23.0f, -17.85f, -30.04f, -18.22f, -30.17f)
                lineToRelative(-0.02f, -0.0f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, false, 0.05f, -0.02f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(-0.0f)
                horizontalLineToRelative(-0.0f)
                curveTo(43.56f, 27.19f, 23.19f, 44.35f, 23.19f, 75.34f)
                curveToRelative(0.0f, 17.05f, 7.59f, 37.36f, 27.7f, 48.89f)
                curveTo(22.47f, 117.92f, 2.0f, 93.61f, 2.0f, 64.1f)
                curveTo(2.0f, 28.27f, 32.18f, 2.09f, 63.87f, 2.09f)
                curveToRelative(2.08f, 0.0f, 37.08f, 10.94f, 37.22f, 51.16f)
                curveToRelative(0.1f, 30.18f, -19.21f, 40.41f, -32.72f, 38.44f)
                curveToRelative(-0.01f, -0.0f, 13.68f, -7.81f, 13.68f, -27.41f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null

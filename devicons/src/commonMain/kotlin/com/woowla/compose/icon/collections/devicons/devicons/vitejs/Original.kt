package com.woowla.compose.icon.collections.devicons.devicons.vitejs

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.VitejsGroup

public val VitejsGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = linearGradient(0.0f to Color(0xFF41D1FF), 1.0f to Color(0xFFBD34FE), start =
                    Offset(1.87f,11.24f), end = Offset(73.37f,108.33f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(124.77f, 19.52f)
                lineTo(67.32f, 122.24f)
                curveToRelative(-1.19f, 2.12f, -4.23f, 2.13f, -5.44f, 0.02f)
                lineTo(3.31f, 19.53f)
                curveToRelative(-1.31f, -2.3f, 0.65f, -5.09f, 3.26f, -4.62f)
                lineTo(64.07f, 25.19f)
                arcToRelative(3.09f, 3.09f, 0.0f, false, false, 1.11f, 0.0f)
                lineToRelative(56.3f, -10.26f)
                curveToRelative(2.6f, -0.47f, 4.57f, 2.29f, 3.29f, 4.59f)
                close()
                moveTo(124.77f, 19.52f)
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFEA83), 0.08f to Color(0xFFFFDD35), 1.0f
                    to Color(0xFFFFA800), start = Offset(60.77f,3.69f), end = Offset(73.7f,92.41f)),
                    stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                    Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(91.46f, 1.43f)
                lineTo(48.95f, 9.76f)
                arcToRelative(1.56f, 1.56f, 0.0f, false, false, -1.26f, 1.44f)
                lineToRelative(-2.62f, 44.17f)
                arcToRelative(1.56f, 1.56f, 0.0f, false, false, 1.91f, 1.61f)
                lineToRelative(11.84f, -2.73f)
                arcToRelative(1.56f, 1.56f, 0.0f, false, true, 1.88f, 1.84f)
                lineToRelative(-3.52f, 17.22f)
                arcToRelative(1.56f, 1.56f, 0.0f, false, false, 1.99f, 1.8f)
                lineToRelative(7.31f, -2.22f)
                curveToRelative(1.13f, -0.34f, 2.22f, 0.65f, 1.99f, 1.81f)
                lineToRelative(-5.59f, 27.05f)
                curveToRelative(-0.35f, 1.69f, 1.9f, 2.61f, 2.84f, 1.16f)
                lineToRelative(0.63f, -0.97f)
                lineToRelative(34.64f, -69.13f)
                curveToRelative(0.58f, -1.16f, -0.42f, -2.48f, -1.69f, -2.23f)
                lineToRelative(-12.19f, 2.35f)
                arcToRelative(1.56f, 1.56f, 0.0f, false, true, -1.79f, -1.97f)
                lineToRelative(7.95f, -27.56f)
                arcTo(1.56f, 1.56f, 0.0f, false, false, 91.46f, 1.43f)
                close()
                moveTo(91.46f, 1.43f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null

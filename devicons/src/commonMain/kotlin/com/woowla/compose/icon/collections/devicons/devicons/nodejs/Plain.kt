package com.woowla.compose.icon.collections.devicons.devicons.nodejs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.NodejsGroup

public val NodejsGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF5fa04e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 0.0f)
                arcToRelative(5.62f, 5.62f, 0.0f, false, false, -2.79f, 0.74f)
                lineTo(11.44f, 29.65f)
                lineTo(28.85f, 61.58f)
                lineTo(64.59f, 0.05f)
                arcTo(8.18f, 8.18f, 0.0f, false, false, 64.0f, 0.0f)
                close()
                moveTo(66.32f, 0.61f)
                verticalLineToRelative(0.0f)
                lineToRelative(35.19f, 60.58f)
                lineToRelative(16.55f, -30.45f)
                arcToRelative(5.48f, 5.48f, 0.0f, false, false, -1.03f, -0.82f)
                lineTo(91.38f, 15.02f)
                lineTo(66.7f, 0.75f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.12f, -0.06f, -0.25f, -0.1f, -0.38f, -0.15f)
                close()
                moveTo(65.29f, 0.85f)
                lineTo(29.42f, 62.62f)
                lineToRelative(35.58f, 65.28f)
                curveToRelative(0.1f, -0.02f, 0.2f, -0.02f, 0.3f, -0.05f)
                lineToRelative(35.65f, -65.62f)
                close()
                moveTo(10.59f, 30.18f)
                curveToRelative(-1.5f, 1.03f, -2.35f, 2.75f, -2.35f, 4.59f)
                verticalLineToRelative(58.48f)
                curveToRelative(0.0f, 0.93f, 0.25f, 1.84f, 0.68f, 2.64f)
                lineToRelative(19.34f, -33.29f)
                close()
                moveTo(118.75f, 31.58f)
                lineTo(102.1f, 62.21f)
                lineTo(119.76f, 92.6f)
                lineTo(119.76f, 34.77f)
                curveToRelative(0.0f, -1.15f, -0.38f, -2.27f, -1.02f, -3.19f)
                close()
                moveTo(101.54f, 63.24f)
                lineTo(66.74f, 127.3f)
                lineTo(66.79f, 127.28f)
                lineTo(117.03f, 98.09f)
                lineTo(117.04f, 98.09f)
                curveToRelative(1.4f, -0.79f, 2.3f, -2.15f, 2.6f, -3.69f)
                close()
                moveTo(28.82f, 63.64f)
                lineTo(9.55f, 96.83f)
                curveToRelative(0.41f, 0.5f, 0.88f, 0.94f, 1.43f, 1.27f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(49.7f, 28.87f)
                lineToRelative(0.53f, 0.31f)
                lineToRelative(0.01f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.26f, 0.15f, 0.53f, 0.27f, 0.8f, 0.37f)
                curveToRelative(0.14f, 0.05f, 0.29f, 0.1f, 0.43f, 0.15f)
                curveToRelative(0.13f, 0.04f, 0.25f, 0.06f, 0.38f, 0.09f)
                curveToRelative(0.24f, 0.05f, 0.48f, 0.09f, 0.73f, 0.11f)
                curveToRelative(0.12f, 0.01f, 0.24f, 0.01f, 0.35f, 0.01f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null

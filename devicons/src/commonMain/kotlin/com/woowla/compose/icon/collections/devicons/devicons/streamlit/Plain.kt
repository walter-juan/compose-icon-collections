package com.woowla.compose.icon.collections.devicons.devicons.streamlit

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
import com.woowla.compose.icon.collections.devicons.devicons.StreamlitGroup

public val StreamlitGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFff4b4b)), stroke = null, strokeLineWidth = 0.426657f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(63.99f, 72.52f)
                lineTo(41.55f, 60.66f)
                lineTo(2.6f, 40.07f)
                curveToRelative(-0.04f, -0.04f, -0.11f, -0.04f, -0.14f, -0.04f)
                curveToRelative(-1.42f, -0.68f, -2.88f, 0.75f, -2.35f, 2.17f)
                lineToRelative(19.85f, 50.62f)
                lineToRelative(0.0f, 0.01f)
                curveToRelative(0.02f, 0.05f, 0.04f, 0.1f, 0.06f, 0.15f)
                curveToRelative(0.81f, 1.89f, 2.59f, 3.05f, 4.53f, 3.51f)
                curveToRelative(0.16f, 0.04f, 0.28f, 0.07f, 0.48f, 0.11f)
                curveToRelative(0.2f, 0.04f, 0.47f, 0.1f, 0.7f, 0.12f)
                curveToRelative(0.04f, 0.0f, 0.07f, 0.0f, 0.11f, 0.01f)
                horizontalLineToRelative(0.03f)
                curveToRelative(0.03f, 0.0f, 0.06f, 0.0f, 0.09f, 0.01f)
                horizontalLineToRelative(0.04f)
                curveToRelative(0.02f, 0.0f, 0.05f, 0.0f, 0.08f, 0.0f)
                horizontalLineToRelative(0.05f)
                curveToRelative(0.03f, 0.0f, 0.06f, 0.0f, 0.09f, 0.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(25.14f, 2.74f, 50.49f, 2.74f, 75.63f, 0.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.3f, 0.0f, 0.6f, -0.01f, 0.88f, -0.04f)
                curveToRelative(0.09f, -0.01f, 0.18f, -0.02f, 0.27f, -0.03f)
                curveToRelative(0.01f, -0.0f, 0.02f, -0.0f, 0.04f, -0.01f)
                curveToRelative(0.06f, -0.01f, 0.12f, -0.02f, 0.18f, -0.03f)
                curveToRelative(0.09f, -0.01f, 0.18f, -0.03f, 0.27f, -0.05f)
                curveToRelative(0.18f, -0.04f, 0.26f, -0.07f, 0.5f, -0.15f)
                curveToRelative(0.24f, -0.08f, 0.64f, -0.23f, 0.89f, -0.35f)
                curveToRelative(0.25f, -0.12f, 0.42f, -0.24f, 0.63f, -0.37f)
                curveToRelative(0.26f, -0.16f, 0.51f, -0.33f, 0.76f, -0.52f)
                curveToRelative(0.11f, -0.08f, 0.18f, -0.14f, 0.26f, -0.21f)
                lineToRelative(-0.04f, -0.02f)
                close()
            }
            path(fill = SolidColor(Color(0xFFff4b4b)), stroke = null, strokeLineWidth = 0.426657f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(125.45f, 40.07f)
                horizontalLineToRelative(-0.04f)
                lineTo(86.45f, 60.66f)
                lineTo(108.11f, 92.92f)
                lineTo(127.9f, 42.21f)
                verticalLineToRelative(-0.07f)
                curveToRelative(0.5f, -1.49f, -1.03f, -2.84f, -2.46f, -2.06f)
            }
            path(fill = SolidColor(Color(0xFFff4b4b)), stroke = null, strokeLineWidth = 0.426657f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(66.07f, 30.29f)
                curveToRelative(-1.0f, -1.45f, -3.16f, -1.45f, -4.12f, 0.0f)
                lineTo(41.55f, 60.66f)
                lineTo(63.99f, 72.52f)
                lineTo(106.52f, 95.0f)
                curveToRelative(0.27f, -0.26f, 0.48f, -0.52f, 0.71f, -0.79f)
                curveToRelative(0.32f, -0.39f, 0.62f, -0.82f, 0.88f, -1.29f)
                lineTo(86.45f, 60.66f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null

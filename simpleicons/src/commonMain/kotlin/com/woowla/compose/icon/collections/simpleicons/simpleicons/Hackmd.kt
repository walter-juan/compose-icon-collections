package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Hackmd: ImageVector
    get() {
        if (_hackmd != null) {
            return _hackmd!!
        }
        _hackmd = Builder(name = "Hackmd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.93f, 12.987f)
                curveToRelative(0.006f, -0.954f, -0.289f, -1.489f, -1.035f, -1.86f)
                lineToRelative(-4.559f, -2.275f)
                quadToRelative(-0.271f, -0.135f, -0.551f, -0.239f)
                lineToRelative(-0.03f, -3.085f)
                curveToRelative(-0.02f, -0.907f, -0.293f, -1.485f, -1.039f, -1.857f)
                lineToRelative(-4.56f, -2.274f)
                arcToRelative(5.49f, 5.49f, 0.0f, false, false, -5.025f, 0.06f)
                lineToRelative(-5.86f, 3.1f)
                curveToRelative(-0.648f, 0.343f, -0.983f, 0.98f, -0.998f, 1.626f)
                lineToRelative(-0.272f, 4.67f)
                curveToRelative(-0.012f, 0.441f, 0.157f, 0.914f, 0.576f, 1.166f)
                lineToRelative(4.878f, 2.924f)
                quadToRelative(0.436f, 0.26f, 0.9f, 0.434f)
                lineToRelative(-0.149f, 2.95f)
                curveToRelative(-0.018f, 0.468f, 0.13f, 0.895f, 0.55f, 1.147f)
                lineToRelative(4.878f, 2.924f)
                arcToRelative(5.49f, 5.49f, 0.0f, false, false, 5.583f, 0.044f)
                lineToRelative(6.213f, -3.593f)
                curveToRelative(0.43f, -0.248f, 0.57f, -0.68f, 0.57f, -1.152f)
                lineToRelative(-0.071f, -4.71f)
                close()
                moveTo(6.21f, 9.07f)
                curveToRelative(-1.035f, -0.478f, -3.854f, -1.977f, -4.07f, -2.098f)
                curveToRelative(-0.487f, -0.273f, -0.51f, -0.562f, -0.484f, -0.91f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, 0.531f, -0.793f)
                lineToRelative(5.579f, -2.838f)
                arcToRelative(4.26f, 4.26f, 0.0f, false, true, 3.819f, -0.01f)
                curveToRelative(0.994f, 0.496f, 2.984f, 1.488f, 3.978f, 1.986f)
                lineToRelative(0.01f, 0.005f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, 0.513f, 1.036f)
                arcToRelative(0.92f, 0.92f, 0.0f, false, true, -0.495f, 0.678f)
                curveToRelative(-0.077f, 0.042f, -4.35f, 2.346f, -5.202f, 2.804f)
                arcToRelative(4.67f, 4.67f, 0.0f, false, true, -4.178f, 0.14f)
                close()
                moveTo(22.248f, 13.035f)
                curveToRelative(-0.042f, 0.29f, -0.204f, 0.567f, -0.492f, 0.738f)
                lineToRelative(-5.313f, 3.159f)
                arcToRelative(4.34f, 4.34f, 0.0f, false, true, -4.31f, 0.076f)
                lineTo(8.235f, 14.87f)
                curveToRelative(-0.708f, -0.388f, -0.712f, -1.418f, -0.008f, -1.813f)
                lineToRelative(5.275f, -2.947f)
                arcToRelative(4.34f, 4.34f, 0.0f, false, true, 3.967f, -0.14f)
                lineToRelative(4.201f, 1.976f)
                curveToRelative(0.359f, 0.17f, 0.556f, 0.503f, 0.585f, 0.85f)
                quadToRelative(0.01f, 0.12f, -0.007f, 0.24f)
                close()
            }
        }
        .build()
        return _hackmd!!
    }

private var _hackmd: ImageVector? = null

package com.woowla.compose.icon.collections.devicons.devicons.processing

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.ProcessingGroup

public val ProcessingGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 0.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 0.0f, 64.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, 64.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, -64.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 64.0f, 0.0f)
                close()
                moveTo(73.91f, 22.22f)
                curveToRelative(7.07f, -0.01f, 14.58f, 2.43f, 15.83f, 10.44f)
                curveToRelative(0.71f, 4.55f, 1.2f, 12.1f, -9.96f, 17.83f)
                curveToRelative(8.64f, 2.34f, 11.53f, 7.89f, 11.63f, 13.36f)
                curveToRelative(0.24f, 12.84f, -12.23f, 20.7f, -23.45f, 19.44f)
                lineToRelative(0.08f, -6.48f)
                curveToRelative(9.94f, 1.14f, 14.76f, -5.34f, 14.98f, -11.42f)
                curveToRelative(0.22f, -6.24f, -5.24f, -10.54f, -14.98f, -10.35f)
                lineToRelative(-0.15f, -6.1f)
                curveToRelative(12.19f, -0.9f, 15.62f, -9.34f, 14.1f, -14.03f)
                curveToRelative(-2.08f, -6.42f, -8.71f, -7.6f, -14.57f, -5.35f)
                lineToRelative(-1.0f, 7.15f)
                lineToRelative(-4.66f, -0.15f)
                lineToRelative(0.4f, -11.88f)
                curveToRelative(2.29f, -1.31f, 6.92f, -2.47f, 11.76f, -2.48f)
                close()
                moveTo(60.5f, 49.22f)
                lineTo(60.5f, 97.29f)
                curveToRelative(2.56f, -0.18f, 6.01f, 0.7f, 9.14f, 1.21f)
                verticalLineToRelative(5.27f)
                lineToRelative(-27.75f, -0.02f)
                verticalLineToRelative(-5.35f)
                curveToRelative(2.99f, -0.41f, 5.75f, -1.09f, 9.02f, -1.17f)
                lineTo(50.92f, 55.97f)
                curveToRelative(-3.68f, -0.06f, -7.14f, -0.87f, -8.89f, -1.47f)
                verticalLineToRelative(-5.13f)
                lineToRelative(18.47f, -0.16f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null

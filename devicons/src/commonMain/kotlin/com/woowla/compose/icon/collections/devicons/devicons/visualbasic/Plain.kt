package com.woowla.compose.icon.collections.devicons.devicons.visualbasic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.VisualbasicGroup

public val VisualbasicGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF004e8c)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 0.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 0.0f, 64.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, 64.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, -64.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 64.0f, 0.0f)
                close()
                moveTo(60.24f, 38.7f)
                lineToRelative(6.34f, 0.1f)
                lineTo(48.0f, 89.2f)
                horizontalLineToRelative(-6.58f)
                lineTo(23.14f, 38.8f)
                horizontalLineToRelative(6.58f)
                lineToRelative(14.0f, 40.0f)
                arcToRelative(23.74f, 23.74f, 0.0f, false, true, 1.02f, 4.46f)
                horizontalLineToRelative(0.14f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, 1.12f, -4.56f)
                close()
                moveTo(73.84f, 38.8f)
                horizontalLineToRelative(14.34f)
                arcTo(15.68f, 15.68f, 0.0f, false, true, 98.54f, 42.0f)
                arcToRelative(10.34f, 10.34f, 0.0f, false, true, 3.84f, 8.34f)
                arcToRelative(12.26f, 12.26f, 0.0f, false, true, -2.38f, 7.44f)
                arcToRelative(12.52f, 12.52f, 0.0f, false, true, -6.4f, 4.5f)
                verticalLineToRelative(0.14f)
                arcToRelative(12.82f, 12.82f, 0.0f, false, true, 8.16f, 3.84f)
                arcToRelative(11.84f, 11.84f, 0.0f, false, true, 3.06f, 8.46f)
                arcToRelative(13.18f, 13.18f, 0.0f, false, true, -4.64f, 10.48f)
                arcToRelative(17.28f, 17.28f, 0.0f, false, true, -11.7f, 4.0f)
                lineTo(73.84f, 89.2f)
                close()
                moveTo(86.54f, 44.06f)
                lineToRelative(-6.7f, 0.06f)
                lineTo(79.84f, 60.4f)
                horizontalLineToRelative(6.0f)
                arcToRelative(11.48f, 11.48f, 0.0f, false, false, 7.58f, -2.4f)
                arcToRelative(8.14f, 8.14f, 0.0f, false, false, 2.78f, -6.6f)
                curveToRelative(0.0f, -4.89f, -3.22f, -7.34f, -9.66f, -7.34f)
                close()
                moveTo(79.84f, 65.7f)
                verticalLineToRelative(18.14f)
                horizontalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.0f, -2.46f)
                arcToRelative(8.42f, 8.42f, 0.0f, false, false, 2.86f, -6.74f)
                curveToRelative(0.0f, -5.95f, -4.05f, -8.92f, -12.16f, -8.92f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null

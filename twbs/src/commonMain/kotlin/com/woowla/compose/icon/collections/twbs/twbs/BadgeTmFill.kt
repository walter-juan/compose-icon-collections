package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.BadgeTmFill: ImageVector
    get() {
        if (_badgeTmFill != null) {
            return _badgeTmFill!!
        }
        _badgeTmFill = Builder(name = "BadgeTmFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(16.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(5.295f, 5.995f)
                lineTo(5.295f, 11.0f)
                lineTo(4.104f, 11.0f)
                lineTo(4.104f, 5.995f)
                horizontalLineToRelative(-1.7f)
                lineTo(2.404f, 5.0f)
                lineTo(7.0f, 5.0f)
                verticalLineToRelative(0.994f)
                lineTo(5.295f, 5.994f)
                close()
                moveTo(8.692f, 7.01f)
                lineTo(8.692f, 11.0f)
                lineTo(7.633f, 11.0f)
                lineTo(7.633f, 5.001f)
                horizontalLineToRelative(1.209f)
                lineToRelative(1.71f, 3.894f)
                horizontalLineToRelative(0.039f)
                lineToRelative(1.71f, -3.894f)
                lineTo(13.5f, 5.001f)
                lineTo(13.5f, 11.0f)
                horizontalLineToRelative(-1.072f)
                lineTo(12.428f, 7.01f)
                horizontalLineToRelative(-0.057f)
                lineToRelative(-1.42f, 3.239f)
                horizontalLineToRelative(-0.773f)
                lineTo(8.75f, 7.008f)
                horizontalLineToRelative(-0.058f)
                close()
            }
        }
        .build()
        return _badgeTmFill!!
    }

private var _badgeTmFill: ImageVector? = null

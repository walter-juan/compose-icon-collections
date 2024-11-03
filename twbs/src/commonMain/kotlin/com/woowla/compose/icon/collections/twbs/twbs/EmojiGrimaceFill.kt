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

public val Twbs.EmojiGrimaceFill: ImageVector
    get() {
        if (_emojiGrimaceFill != null) {
            return _emojiGrimaceFill!!
        }
        _emojiGrimaceFill = Builder(name = "EmojiGrimaceFill", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                moveTo(7.0f, 6.25f)
                curveTo(7.0f, 5.56f, 6.552f, 5.0f, 6.0f, 5.0f)
                reflectiveCurveToRelative(-1.0f, 0.56f, -1.0f, 1.25f)
                reflectiveCurveToRelative(0.448f, 1.25f, 1.0f, 1.25f)
                reflectiveCurveToRelative(1.0f, -0.56f, 1.0f, -1.25f)
                moveToRelative(3.0f, 1.25f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.56f, 1.0f, -1.25f)
                reflectiveCurveTo(10.552f, 5.0f, 10.0f, 5.0f)
                reflectiveCurveToRelative(-1.0f, 0.56f, -1.0f, 1.25f)
                reflectiveCurveToRelative(0.448f, 1.25f, 1.0f, 1.25f)
                moveToRelative(1.5f, 4.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.48f, -1.25f)
                verticalLineToRelative(-0.003f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -0.497f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.5f, 9.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.48f, 1.25f)
                verticalLineToRelative(0.003f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 0.497f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 4.5f, 12.0f)
                close()
                moveTo(3.531f, 10.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.969f, 0.75f)
                horizontalLineToRelative(0.25f)
                verticalLineToRelative(-0.75f)
                close()
                moveTo(12.469f, 10.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.969f, 0.75f)
                horizontalLineToRelative(-0.25f)
                verticalLineToRelative(-0.75f)
                close()
                moveTo(11.5f, 9.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.969f, 0.75f)
                lineTo(11.25f, 10.25f)
                lineTo(11.25f, 9.5f)
                close()
                moveTo(3.531f, 10.25f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.5f, 9.5f)
                horizontalLineToRelative(0.25f)
                verticalLineToRelative(0.75f)
                close()
                moveTo(5.25f, 11.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.75f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(7.75f, 11.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.75f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(9.25f, 11.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.75f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(10.75f, 11.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.75f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(9.75f, 9.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(8.25f, 9.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(6.75f, 9.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(5.25f, 9.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _emojiGrimaceFill!!
    }

private var _emojiGrimaceFill: ImageVector? = null

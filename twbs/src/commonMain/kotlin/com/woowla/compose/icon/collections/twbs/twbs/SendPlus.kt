package com.woowla.compose.icon.collections.twbs.twbs

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
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.SendPlus: ImageVector
    get() {
        if (_sendPlus != null) {
            return _sendPlus!!
        }
        _sendPlus = Builder(name = "SendPlus", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.964f, 0.686f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.65f, -0.65f)
                lineTo(0.767f, 5.855f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.124f, 1.329f)
                lineToRelative(4.995f, 3.178f)
                lineToRelative(1.531f, 2.406f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.844f, -0.536f)
                lineTo(6.637f, 10.07f)
                lineToRelative(7.494f, -7.494f)
                lineToRelative(-1.895f, 4.738f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.928f, 0.372f)
                close()
                moveTo(13.424f, 1.869f)
                lineTo(5.93f, 9.363f)
                lineTo(1.591f, 6.602f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 12.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -7.0f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 7.0f, 0.0f)
                moveToRelative(-3.5f, -2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
            }
        }
        .build()
        return _sendPlus!!
    }

private var _sendPlus: ImageVector? = null

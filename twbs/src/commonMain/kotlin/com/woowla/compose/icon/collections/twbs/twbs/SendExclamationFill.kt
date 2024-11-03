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

public val Twbs.SendExclamationFill: ImageVector
    get() {
        if (_sendExclamationFill != null) {
            return _sendExclamationFill!!
        }
        _sendExclamationFill = Builder(name = "SendExclamationFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.964f, 0.686f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.65f, -0.65f)
                lineTo(0.767f, 5.855f)
                lineTo(0.766f, 5.855f)
                lineToRelative(-0.452f, 0.18f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.082f, 0.887f)
                lineToRelative(0.41f, 0.26f)
                lineToRelative(0.001f, 0.002f)
                lineToRelative(4.995f, 3.178f)
                lineToRelative(1.59f, 2.498f)
                curveTo(8.0f, 14.0f, 8.0f, 13.0f, 8.0f, 12.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 5.026f, -4.47f)
                close()
                moveTo(14.131f, 2.576f)
                lineTo(6.637f, 10.07f)
                lineToRelative(-0.215f, -0.338f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.154f, -0.154f)
                lineToRelative(-0.338f, -0.215f)
                lineToRelative(7.494f, -7.494f)
                lineToRelative(1.178f, -0.471f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 16.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, -7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, 7.0f)
                moveToRelative(0.5f, -5.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineTo(11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                moveToRelative(0.0f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
            }
        }
        .build()
        return _sendExclamationFill!!
    }

private var _sendExclamationFill: ImageVector? = null

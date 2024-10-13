package com.woowla.compose.icon.collections.tabler.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup

public val OutlineGroup.Sock: ImageVector
    get() {
        if (_sock != null) {
            return _sock!!
        }
        _sock = Builder(name = "Sock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 3.0f)
                verticalLineToRelative(6.0f)
                lineToRelative(4.798f, 5.142f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.441f, 5.86f)
                lineToRelative(-6.736f, -6.41f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.621f, -1.451f)
                verticalLineToRelative(-9.141f)
                horizontalLineToRelative(8.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.895f, 15.768f)
                curveToRelative(0.708f, -0.721f, 1.105f, -1.677f, 1.105f, -2.768f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
            }
        }
        .build()
        return _sock!!
    }

private var _sock: ImageVector? = null

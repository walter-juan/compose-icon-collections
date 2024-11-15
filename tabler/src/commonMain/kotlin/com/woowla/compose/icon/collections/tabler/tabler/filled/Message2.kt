package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.Message2: ImageVector
    get() {
        if (_message2 != null) {
            return _message2!!
        }
        _message2 = Builder(name = "Message2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 3.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineToRelative(-2.586f)
                lineToRelative(-2.707f, 2.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.32f, 0.083f)
                lineToRelative(-0.094f, -0.083f)
                lineToRelative(-2.708f, -2.707f)
                horizontalLineToRelative(-2.585f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.995f, -3.8f)
                lineToRelative(-0.005f, -0.2f)
                verticalLineToRelative(-8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                close()
                moveTo(14.0f, 12.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(2.0f, -4.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
            }
        }
        .build()
        return _message2!!
    }

private var _message2: ImageVector? = null

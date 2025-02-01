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

public val FilledGroup.EyeTable: ImageVector
    get() {
        if (_eyeTable != null) {
            return _eyeTable!!
        }
        _eyeTable = Builder(name = "EyeTable", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                close()
                moveTo(8.0f, 17.0f)
                lineToRelative(-0.128f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.118f, 1.993f)
                lineToRelative(0.128f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.118f, -1.993f)
                moveToRelative(4.0f, 0.0f)
                lineToRelative(-0.128f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.118f, 1.993f)
                lineToRelative(0.128f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.118f, -1.993f)
                moveToRelative(4.0f, 0.0f)
                lineToRelative(-0.128f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.118f, 1.993f)
                lineToRelative(0.128f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.118f, -1.993f)
                moveToRelative(-6.0f, -3.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(5.0f, 0.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(-1.0f, -8.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
            }
        }
        .build()
        return _eyeTable!!
    }

private var _eyeTable: ImageVector? = null

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

public val FilledGroup.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(name = "Flag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.3f, -0.714f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.213f, -0.176f)
                lineToRelative(0.351f, 0.328f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.272f, 0.0f)
                lineToRelative(0.249f, -0.227f)
                curveToRelative(0.61f, -0.483f, 1.527f, -0.097f, 1.61f, 0.676f)
                lineToRelative(0.005f, 0.113f)
                verticalLineToRelative(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.3f, 0.714f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.213f, 0.176f)
                lineToRelative(-0.351f, -0.328f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.136f, -0.114f)
                verticalLineToRelative(6.552f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-16.0f)
                close()
            }
        }
        .build()
        return _flag!!
    }

private var _flag: ImageVector? = null

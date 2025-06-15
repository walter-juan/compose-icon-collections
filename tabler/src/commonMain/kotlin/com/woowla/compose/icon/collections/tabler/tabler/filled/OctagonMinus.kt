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

public val FilledGroup.OctagonMinus: ImageVector
    get() {
        if (_octagonMinus != null) {
            return _octagonMinus!!
        }
        _octagonMinus = Builder(name = "OctagonMinus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.196f, 1.246f)
                lineToRelative(5.575f, 2.39f)
                arcToRelative(3.04f, 3.04f, 0.0f, false, true, 1.595f, 1.594f)
                lineToRelative(2.388f, 5.573f)
                curveToRelative(0.328f, 0.764f, 0.328f, 1.63f, 0.0f, 2.393f)
                lineToRelative(-2.39f, 5.575f)
                arcToRelative(3.04f, 3.04f, 0.0f, false, true, -1.594f, 1.595f)
                lineToRelative(-5.573f, 2.388f)
                arcToRelative(3.03f, 3.03f, 0.0f, false, true, -2.393f, 0.0f)
                lineToRelative(-5.574f, -2.389f)
                arcToRelative(3.04f, 3.04f, 0.0f, false, true, -1.595f, -1.595f)
                lineToRelative(-2.388f, -5.574f)
                arcToRelative(3.04f, 3.04f, 0.0f, false, true, 0.0f, -2.392f)
                lineToRelative(2.39f, -5.575f)
                arcToRelative(3.04f, 3.04f, 0.0f, false, true, 1.593f, -1.595f)
                lineToRelative(5.574f, -2.388f)
                arcToRelative(3.04f, 3.04f, 0.0f, false, true, 2.392f, 0.0f)
                moveToRelative(1.804f, 9.754f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
            }
        }
        .build()
        return _octagonMinus!!
    }

private var _octagonMinus: ImageVector? = null

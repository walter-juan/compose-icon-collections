package com.woowla.compose.icon.collections.tabler.tabler.filled

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
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.Filters: ImageVector
    get() {
        if (_filters != null) {
            return _filters!!
        }
        _filters = Builder(name = "Filters", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.396f, 11.056f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.647f, 10.506f)
                quadToRelative(0.206f, -0.21f, 0.396f, -0.44f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.789f, -6.155f)
                arcToRelative(8.02f, 8.02f, 0.0f, false, false, 3.462f, -3.911f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.609f, 11.051f)
                arcToRelative(7.99f, 7.99f, 0.0f, false, false, 9.386f, 4.698f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -9.534f, -4.594f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -6.0f, 6.0f)
                lineToRelative(0.004f, -0.225f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.996f, -5.775f)
            }
        }
        .build()
        return _filters!!
    }

private var _filters: ImageVector? = null

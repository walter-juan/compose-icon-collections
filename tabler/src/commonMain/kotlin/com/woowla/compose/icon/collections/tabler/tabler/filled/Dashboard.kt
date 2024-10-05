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

public val FilledGroup.Dashboard: ImageVector
    get() {
        if (_dashboard != null) {
            return _dashboard!!
        }
        _dashboard = Builder(name = "Dashboard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.954f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 6.222f, 17.829f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.622f, 0.217f)
                horizontalLineToRelative(-11.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.622f, -0.217f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 6.222f, -17.829f)
                moveToRelative(4.207f, 5.839f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.0f)
                lineToRelative(-2.276f, 2.274f)
                arcToRelative(2.003f, 2.003f, 0.0f, false, false, -2.514f, 1.815f)
                lineToRelative(-0.003f, 0.118f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 3.933f, -0.517f)
                lineToRelative(2.274f, -2.276f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.414f)
            }
        }
        .build()
        return _dashboard!!
    }

private var _dashboard: ImageVector? = null

package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.NodeMinusFill: ImageVector
    get() {
        if (_nodeMinusFill != null) {
            return _nodeMinusFill!!
        }
        _nodeMinusFill = Builder(name = "NodeMinusFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.0f, 8.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -9.975f, 0.5f)
                horizontalLineTo(4.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.5f, 10.0f)
                horizontalLineToRelative(-1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 0.0f, 8.5f)
                verticalLineToRelative(-1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 1.5f, 6.0f)
                horizontalLineToRelative(1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.0f, 7.5f)
                horizontalLineToRelative(2.025f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 16.0f, 8.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(5.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 14.0f, 8.0f)
            }
        }
        .build()
        return _nodeMinusFill!!
    }

private var _nodeMinusFill: ImageVector? = null

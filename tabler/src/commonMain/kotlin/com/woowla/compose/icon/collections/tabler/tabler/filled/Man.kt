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

public val FilledGroup.Man: ImageVector
    get() {
        if (_man != null) {
            return _man!!
        }
        _man = Builder(name = "Man", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 8.0f)
                curveToRelative(1.628f, 0.0f, 3.2f, 0.787f, 4.707f, 2.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 1.414f)
                curveToRelative(-0.848f, -0.848f, -1.662f, -1.369f, -2.444f, -1.587f)
                lineToRelative(-0.849f, 5.944f)
                verticalLineToRelative(4.936f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-4.929f)
                lineToRelative(-0.85f, -5.951f)
                curveToRelative(-0.781f, 0.218f, -1.595f, 0.739f, -2.443f, 1.587f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.414f, -1.414f)
                curveToRelative(1.506f, -1.506f, 3.08f, -2.293f, 4.707f, -2.293f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -3.0f, 3.0f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.995f, -2.824f)
            }
        }
        .build()
        return _man!!
    }

private var _man: ImageVector? = null

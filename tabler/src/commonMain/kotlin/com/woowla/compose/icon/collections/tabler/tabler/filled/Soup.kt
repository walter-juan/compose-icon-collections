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

public val FilledGroup.Soup: ImageVector
    get() {
        if (_soup != null) {
            return _soup!!
        }
        _soup = Builder(name = "Soup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.694f, -2.247f, 5.49f, -3.983f, 6.983f)
                lineToRelative(-0.017f, 0.013f)
                verticalLineToRelative(0.504f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.85f, 1.995f)
                lineToRelative(-0.15f, 0.005f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-0.496f)
                lineToRelative(-0.065f, -0.053f)
                curveToRelative(-1.76f, -1.496f, -3.794f, -4.965f, -3.928f, -6.77f)
                lineToRelative(-0.007f, -0.181f)
                verticalLineToRelative(-0.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.417f, 3.188f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.166f, 1.624f)
                curveToRelative(-0.375f, 0.27f, -0.593f, 0.706f, -0.583f, 1.209f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, false, 0.583f, 1.167f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.166f, 1.624f)
                arcToRelative(3.38f, 3.38f, 0.0f, false, true, -1.417f, -2.791f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, true, 1.417f, -2.833f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.417f, 3.188f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.166f, 1.624f)
                curveToRelative(-0.375f, 0.27f, -0.593f, 0.706f, -0.583f, 1.209f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, false, 0.583f, 1.167f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.166f, 1.624f)
                arcToRelative(3.38f, 3.38f, 0.0f, false, true, -1.417f, -2.791f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, true, 1.417f, -2.833f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.417f, 3.188f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.166f, 1.624f)
                curveToRelative(-0.375f, 0.27f, -0.593f, 0.706f, -0.583f, 1.209f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, false, 0.583f, 1.167f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.166f, 1.624f)
                arcToRelative(3.38f, 3.38f, 0.0f, false, true, -1.417f, -2.791f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, true, 1.417f, -2.833f)
            }
        }
        .build()
        return _soup!!
    }

private var _soup: ImageVector? = null

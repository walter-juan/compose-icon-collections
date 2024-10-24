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

public val FilledGroup.PlayCard10: ImageVector
    get() {
        if (_playCard10 != null) {
            return _playCard10!!
        }
        _playCard10 = Builder(name = "PlayCard10", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineToRelative(-10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineToRelative(-14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                close()
                moveTo(17.01f, 18.0f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.117f, 1.993f)
                lineToRelative(0.127f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(-8.01f, -10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                moveToRelative(4.5f, 0.0f)
                curveToRelative(-1.453f, 0.0f, -2.5f, 1.395f, -2.5f, 3.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.605f, 1.047f, 3.0f, 2.5f, 3.0f)
                reflectiveCurveToRelative(2.5f, -1.395f, 2.5f, -3.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.605f, -1.047f, -3.0f, -2.5f, -3.0f)
                moveToRelative(0.0f, 2.0f)
                curveToRelative(0.203f, 0.0f, 0.5f, 0.395f, 0.5f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.605f, -0.297f, 1.0f, -0.5f, 1.0f)
                reflectiveCurveToRelative(-0.5f, -0.395f, -0.5f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.605f, 0.297f, -1.0f, 0.5f, -1.0f)
                moveToRelative(-6.49f, -6.0f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.117f, 1.993f)
                lineToRelative(0.127f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
            }
        }
        .build()
        return _playCard10!!
    }

private var _playCard10: ImageVector? = null

package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Orchardcore: ImageVector
    get() {
        if (_orchardcore != null) {
            return _orchardcore!!
        }
        _orchardcore = Builder(name = "Orchardcore", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.629f, 0.0f, 12.0f, 0.0f)
                moveToRelative(0.0f, 21.69f)
                curveToRelative(-5.352f, 0.0f, -9.692f, -4.338f, -9.692f, -9.692f)
                curveToRelative(0.0f, -5.352f, 4.338f, -9.691f, 9.692f, -9.691f)
                curveToRelative(5.352f, 0.0f, 9.692f, 4.338f, 9.692f, 9.691f)
                arcTo(9.69f, 9.69f, 0.0f, false, true, 12.0f, 21.69f)
                moveToRelative(5.778f, -3.964f)
                arcToRelative(7.996f, 7.996f, 0.0f, false, true, 0.0f, -11.305f)
                arcToRelative(7.993f, 7.993f, 0.0f, false, true, 0.0f, 11.305f)
                moveToRelative(-3.212f, -3.211f)
                arcTo(7.994f, 7.994f, 0.0f, false, true, 6.572f, 6.52f)
                arcToRelative(7.996f, 7.996f, 0.0f, false, true, 7.994f, 7.994f)
                moveToRelative(-8.13f, 3.242f)
                arcToRelative(7.996f, 7.996f, 0.0f, false, true, 11.306f, 0.0f)
                arcToRelative(7.996f, 7.996f, 0.0f, false, true, -11.305f, 0.0f)
            }
        }
        .build()
        return _orchardcore!!
    }

private var _orchardcore: ImageVector? = null

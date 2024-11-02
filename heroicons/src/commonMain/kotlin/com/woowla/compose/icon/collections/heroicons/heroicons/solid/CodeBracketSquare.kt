package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.CodeBracketSquare: ImageVector
    get() {
        if (_codeBracketSquare != null) {
            return _codeBracketSquare!!
        }
        _codeBracketSquare = Builder(name = "CodeBracketSquare", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 6.0f)
                curveTo(3.0f, 4.343f, 4.343f, 3.0f, 6.0f, 3.0f)
                horizontalLineTo(18.0f)
                curveTo(19.657f, 3.0f, 21.0f, 4.343f, 21.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(21.0f, 19.657f, 19.657f, 21.0f, 18.0f, 21.0f)
                horizontalLineTo(6.0f)
                curveTo(4.343f, 21.0f, 3.0f, 19.657f, 3.0f, 18.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(17.25f, 12.0f)
                curveTo(17.25f, 12.199f, 17.171f, 12.39f, 17.03f, 12.53f)
                lineTo(14.78f, 14.78f)
                curveTo(14.487f, 15.073f, 14.013f, 15.073f, 13.72f, 14.78f)
                curveTo(13.427f, 14.487f, 13.427f, 14.013f, 13.72f, 13.72f)
                lineTo(15.439f, 12.0f)
                lineTo(13.72f, 10.28f)
                curveTo(13.427f, 9.987f, 13.427f, 9.513f, 13.72f, 9.22f)
                curveTo(14.013f, 8.927f, 14.487f, 8.927f, 14.78f, 9.22f)
                lineTo(17.03f, 11.47f)
                curveTo(17.171f, 11.61f, 17.25f, 11.801f, 17.25f, 12.0f)
                close()
                moveTo(6.97f, 11.47f)
                curveTo(6.829f, 11.61f, 6.75f, 11.801f, 6.75f, 12.0f)
                curveTo(6.75f, 12.199f, 6.829f, 12.39f, 6.97f, 12.53f)
                lineTo(9.22f, 14.78f)
                curveTo(9.513f, 15.073f, 9.987f, 15.073f, 10.28f, 14.78f)
                curveTo(10.573f, 14.487f, 10.573f, 14.013f, 10.28f, 13.72f)
                lineTo(8.561f, 12.0f)
                lineTo(10.28f, 10.28f)
                curveTo(10.573f, 9.987f, 10.573f, 9.513f, 10.28f, 9.22f)
                curveTo(9.987f, 8.927f, 9.513f, 8.927f, 9.22f, 9.22f)
                lineTo(6.97f, 11.47f)
                close()
            }
        }
        .build()
        return _codeBracketSquare!!
    }

private var _codeBracketSquare: ImageVector? = null

package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsMoviePlay: ImageVector
    get() {
        if (_bxsMoviePlay != null) {
            return _bxsMoviePlay!!
        }
        _bxsMoviePlay = Builder(name = "BxsMoviePlay", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                lineTo(4.0f, 3.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                lineTo(22.0f, 5.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(20.001f, 9.0f)
                curveToRelative(-0.001f, 0.0f, -0.001f, 0.0f, 0.0f, 0.0f)
                horizontalLineToRelative(-0.465f)
                lineToRelative(-2.667f, -4.0f)
                lineTo(20.0f, 5.0f)
                lineToRelative(0.001f, 4.0f)
                close()
                moveTo(15.5f, 15.0f)
                lineTo(10.0f, 18.0f)
                verticalLineToRelative(-6.0f)
                lineToRelative(5.5f, 3.0f)
                close()
                moveTo(14.536f, 9.0f)
                lineTo(11.869f, 5.0f)
                horizontalLineToRelative(2.596f)
                lineToRelative(2.667f, 4.0f)
                horizontalLineToRelative(-2.596f)
                close()
                moveTo(12.132f, 9.0f)
                lineTo(9.536f, 9.0f)
                lineTo(6.869f, 5.0f)
                horizontalLineToRelative(2.596f)
                lineToRelative(2.667f, 4.0f)
                close()
                moveTo(4.0f, 5.0f)
                horizontalLineToRelative(0.465f)
                lineToRelative(2.667f, 4.0f)
                lineTo(4.0f, 9.0f)
                lineTo(4.0f, 5.0f)
                close()
            }
        }
        .build()
        return _bxsMoviePlay!!
    }

private var _bxsMoviePlay: ImageVector? = null

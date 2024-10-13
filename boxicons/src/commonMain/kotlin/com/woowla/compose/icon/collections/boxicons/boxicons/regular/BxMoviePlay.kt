package com.woowla.compose.icon.collections.boxicons.boxicons.regular

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
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxMoviePlay: ImageVector
    get() {
        if (_bxMoviePlay != null) {
            return _bxMoviePlay!!
        }
        _bxMoviePlay = Builder(name = "BxMoviePlay", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(9.536f, 9.0f)
                lineTo(6.869f, 5.0f)
                horizontalLineToRelative(2.596f)
                lineToRelative(2.667f, 4.0f)
                lineTo(9.536f, 9.0f)
                close()
                moveTo(14.536f, 9.0f)
                lineTo(11.869f, 5.0f)
                horizontalLineToRelative(2.596f)
                lineToRelative(2.667f, 4.0f)
                horizontalLineToRelative(-2.596f)
                close()
                moveTo(4.0f, 5.0f)
                horizontalLineToRelative(0.465f)
                lineToRelative(2.667f, 4.0f)
                lineTo(4.0f, 9.0f)
                lineTo(4.0f, 5.0f)
                close()
                moveTo(4.0f, 19.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(16.0f)
                lineToRelative(0.002f, 8.0f)
                lineTo(4.0f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 18.0f)
                lineToRelative(5.5f, -3.0f)
                lineToRelative(-5.5f, -3.0f)
                close()
            }
        }
        .build()
        return _bxMoviePlay!!
    }

private var _bxMoviePlay: ImageVector? = null

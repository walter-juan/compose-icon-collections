package com.woowla.compose.icon.collections.boxicons.boxicons.solid

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
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsWatch: ImageVector
    get() {
        if (_bxsWatch != null) {
            return _bxsWatch!!
        }
        _bxsWatch = Builder(name = "BxsWatch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.999f, 12.0f)
                curveToRelative(0.0f, -2.953f, -1.612f, -5.53f, -3.999f, -6.916f)
                lineTo(16.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(9.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(2.083f)
                curveTo(5.613f, 6.469f, 4.001f, 9.047f, 4.001f, 12.0f)
                arcToRelative(8.003f, 8.003f, 0.0f, false, false, 4.136f, 7.0f)
                lineTo(8.0f, 19.0f)
                verticalLineToRelative(2.041f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(16.0f, 19.0f)
                horizontalLineToRelative(-0.139f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.138f, -7.0f)
                close()
                moveTo(11.999f, 17.999f)
                arcTo(6.005f, 6.005f, 0.0f, false, true, 6.001f, 12.0f)
                arcToRelative(6.005f, 6.005f, 0.0f, false, true, 5.998f, -5.999f)
                curveToRelative(3.31f, 0.0f, 6.0f, 2.691f, 6.0f, 5.999f)
                arcToRelative(6.005f, 6.005f, 0.0f, false, true, -6.0f, 5.999f)
                close()
            }
        }
        .build()
        return _bxsWatch!!
    }

private var _bxsWatch: ImageVector? = null

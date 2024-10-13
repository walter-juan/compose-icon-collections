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

public val RegularGroup.BxShuffle: ImageVector
    get() {
        if (_bxShuffle != null) {
            return _bxShuffle!!
        }
        _bxShuffle = Builder(name = "BxShuffle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 17.0f)
                horizontalLineToRelative(-1.559f)
                lineToRelative(-9.7f, -10.673f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.001f, 6.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.559f)
                lineToRelative(4.09f, 4.5f)
                lineToRelative(-4.09f, 4.501f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.001f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.74f, -0.327f)
                lineTo(10.0f, 13.987f)
                lineToRelative(4.259f, 4.686f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.74f, 0.327f)
                horizontalLineTo(17.0f)
                verticalLineToRelative(3.0f)
                lineToRelative(5.0f, -4.0f)
                lineToRelative(-5.0f, -4.0f)
                verticalLineToRelative(3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.441f, 8.0f)
                horizontalLineTo(17.0f)
                verticalLineToRelative(3.0f)
                lineToRelative(5.0f, -3.938f)
                lineTo(17.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.001f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.74f, 0.327f)
                lineToRelative(-3.368f, 3.707f)
                lineToRelative(1.48f, 1.346f)
                lineTo(15.441f, 8.0f)
                close()
            }
        }
        .build()
        return _bxShuffle!!
    }

private var _bxShuffle: ImageVector? = null

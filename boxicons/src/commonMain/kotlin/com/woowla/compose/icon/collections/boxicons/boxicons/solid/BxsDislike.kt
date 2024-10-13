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

public val SolidGroup.BxsDislike: ImageVector
    get() {
        if (_bxsDislike != null) {
            return _bxsDislike!!
        }
        _bxsDislike = Builder(name = "BxsDislike", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(4.0f, 16.0f)
                horizontalLineToRelative(7.0f)
                lineToRelative(-1.122f, 3.368f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.775f, 22.0f)
                horizontalLineTo(12.0f)
                lineToRelative(5.0f, -5.438f)
                verticalLineTo(3.0f)
                horizontalLineTo(6.0f)
                lineToRelative(-3.937f, 8.649f)
                lineToRelative(-0.063f, 0.293f)
                verticalLineTo(14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _bxsDislike!!
    }

private var _bxsDislike: ImageVector? = null

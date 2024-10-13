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

public val SolidGroup.BxsCrop: ImageVector
    get() {
        if (_bxsCrop != null) {
            return _bxsCrop!!
        }
        _bxsCrop = Builder(name = "BxsCrop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 7.5f)
                curveTo(19.0f, 6.121f, 17.879f, 5.0f, 16.5f, 5.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(7.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 10.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(6.5f)
                curveTo(5.0f, 17.879f, 6.121f, 19.0f, 7.5f, 19.0f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _bxsCrop!!
    }

private var _bxsCrop: ImageVector? = null

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

public val RegularGroup.BxBox: ImageVector
    get() {
        if (_bxBox != null) {
            return _bxBox!!
        }
        _bxBox = Builder(name = "BxBox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                lineTo(4.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.0f, 1.72f)
                lineTo(3.0f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(21.0f, 8.72f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 7.0f)
                lineTo(22.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(4.0f, 5.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 7.0f)
                close()
                moveTo(5.0f, 19.0f)
                lineTo(5.0f, 9.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 11.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _bxBox!!
    }

private var _bxBox: ImageVector? = null

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

public val RegularGroup.BxCartAlt: ImageVector
    get() {
        if (_bxCartAlt != null) {
            return _bxCartAlt!!
        }
        _bxCartAlt = Builder(name = "BxCartAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                lineTo(2.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.3f)
                lineToRelative(3.28f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.82f, 2.0f)
                lineTo(19.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-8.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.94f, -0.66f)
                lineTo(9.0f, 13.0f)
                horizontalLineToRelative(9.28f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.92f, -1.45f)
                lineTo(22.0f, 5.27f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.27f, 4.0f)
                arcTo(0.84f, 0.84f, 0.0f, false, false, 21.0f, 4.0f)
                close()
                moveTo(18.25f, 11.0f)
                horizontalLineToRelative(-10.0f)
                lineTo(6.43f, 6.0f)
                horizontalLineToRelative(13.24f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 19.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 19.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
        }
        .build()
        return _bxCartAlt!!
    }

private var _bxCartAlt: ImageVector? = null

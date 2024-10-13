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

public val SolidGroup.BxsFileImport: ImageVector
    get() {
        if (_bxsFileImport != null) {
            return _bxsFileImport!!
        }
        _bxsFileImport = Builder(name = "BxsFileImport", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 14.0f)
                verticalLineTo(8.0f)
                lineToRelative(-6.0f, -6.0f)
                horizontalLineTo(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(3.0f)
                lineToRelative(-5.0f, -4.0f)
                lineToRelative(5.0f, -4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(13.0f, 4.0f)
                lineToRelative(5.0f, 5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _bxsFileImport!!
    }

private var _bxsFileImport: ImageVector? = null

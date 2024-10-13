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

public val SolidGroup.BxsArchive: ImageVector
    get() {
        if (_bxsArchive != null) {
            return _bxsArchive!!
        }
        _bxsArchive = Builder(name = "BxsArchive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.704f, 5.29f)
                lineToRelative(-2.997f, -2.997f)
                arcTo(0.996f, 0.996f, 0.0f, false, false, 18.0f, 2.0f)
                horizontalLineTo(6.0f)
                arcToRelative(0.996f, 0.996f, 0.0f, false, false, -0.707f, 0.293f)
                lineTo(2.296f, 5.29f)
                arcTo(0.994f, 0.994f, 0.0f, false, false, 2.0f, 5.999f)
                verticalLineTo(19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(5.999f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, false, -0.296f, -0.709f)
                close()
                moveTo(6.414f, 4.0f)
                horizontalLineToRelative(11.172f)
                lineToRelative(1.0f, 1.0f)
                horizontalLineTo(5.414f)
                lineToRelative(1.0f, -1.0f)
                close()
                moveTo(17.0f, 13.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _bxsArchive!!
    }

private var _bxsArchive: ImageVector? = null

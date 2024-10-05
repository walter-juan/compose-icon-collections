package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.FileBadge24: ImageVector
    get() {
        if (_fileBadge24 != null) {
            return _fileBadge24!!
        }
        _fileBadge24 = Builder(name = "FileBadge24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(18.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(10.982f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.414f, 0.586f)
                lineToRelative(0.064f, 0.064f)
                lineToRelative(0.01f, 0.008f)
                lineToRelative(0.31f, 0.312f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 1.06f)
                lineToRelative(-0.078f, -0.078f)
                lineToRelative(-0.004f, -0.003f)
                lineToRelative(-0.093f, -0.093f)
                curveToRelative(-0.003f, -0.003f, 0.0f, 0.0f, 0.0f, 0.0f)
                lineToRelative(-0.21f, -0.21f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.353f, -0.146f)
                horizontalLineTo(4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 6.25f)
                arcToRelative(4.25f, 4.25f, 0.0f, true, false, 0.0f, 8.5f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, false, 0.0f, -8.5f)
                close()
                moveTo(12.25f, 10.5f)
                arcToRelative(5.75f, 5.75f, 0.0f, true, true, 11.5f, 0.0f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, true, -11.5f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.283f, 14.866f)
                lineToRelative(1.455f, 8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.002f, 0.836f)
                lineToRelative(-3.296f, -1.24f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, -0.88f, 0.0f)
                lineToRelative(-3.296f, 1.24f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.002f, -0.836f)
                lineToRelative(1.455f, -8.0f)
                lineToRelative(1.475f, 0.268f)
                lineToRelative(-1.217f, 6.698f)
                lineToRelative(2.056f, -0.774f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 1.938f, 0.0f)
                lineToRelative(2.056f, 0.774f)
                lineToRelative(-1.217f, -6.698f)
                lineToRelative(1.475f, -0.268f)
                close()
            }
        }
        .build()
        return _fileBadge24!!
    }

private var _fileBadge24: ImageVector? = null

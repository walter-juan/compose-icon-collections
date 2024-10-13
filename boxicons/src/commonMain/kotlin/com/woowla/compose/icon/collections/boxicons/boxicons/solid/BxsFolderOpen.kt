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

public val SolidGroup.BxsFolderOpen: ImageVector
    get() {
        if (_bxsFolderOpen != null) {
            return _bxsFolderOpen!!
        }
        _bxsFolderOpen = Builder(name = "BxsFolderOpen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.165f, 19.551f)
                curveToRelative(0.186f, 0.28f, 0.499f, 0.449f, 0.835f, 0.449f)
                horizontalLineToRelative(15.0f)
                curveToRelative(0.4f, 0.0f, 0.762f, -0.238f, 0.919f, -0.606f)
                lineToRelative(3.0f, -7.0f)
                arcTo(0.998f, 0.998f, 0.0f, false, false, 21.0f, 11.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(8.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-6.655f)
                lineTo(8.789f, 4.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.158f, 0.551f)
                close()
                moveTo(18.0f, 8.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(6.0f)
                curveToRelative(-0.4f, 0.0f, -0.762f, 0.238f, -0.919f, 0.606f)
                lineTo(4.0f, 14.129f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(14.0f)
                close()
            }
        }
        .build()
        return _bxsFolderOpen!!
    }

private var _bxsFolderOpen: ImageVector? = null

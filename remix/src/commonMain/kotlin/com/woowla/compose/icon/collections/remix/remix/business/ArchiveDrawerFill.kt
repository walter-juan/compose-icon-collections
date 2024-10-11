package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.ArchiveDrawerFill: ImageVector
    get() {
        if (_archiveDrawerFill != null) {
            return _archiveDrawerFill!!
        }
        _archiveDrawerFill = Builder(name = "ArchiveDrawerFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 13.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.003f)
                curveTo(21.0f, 21.553f, 20.555f, 22.0f, 20.007f, 22.0f)
                horizontalLineTo(3.993f)
                curveTo(3.445f, 22.0f, 3.0f, 21.554f, 3.0f, 21.003f)
                verticalLineTo(13.0f)
                close()
                moveTo(3.0f, 2.998f)
                curveTo(3.0f, 2.447f, 3.445f, 2.0f, 3.993f, 2.0f)
                horizontalLineTo(20.007f)
                curveTo(20.555f, 2.0f, 21.0f, 2.446f, 21.0f, 2.998f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(2.998f)
                close()
                moveTo(9.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(9.0f, 16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _archiveDrawerFill!!
    }

private var _archiveDrawerFill: ImageVector? = null

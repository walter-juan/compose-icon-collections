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

public val BusinessGroup.ProjectorFill: ImageVector
    get() {
        if (_projectorFill != null) {
            return _projectorFill!!
        }
        _projectorFill = Builder(name = "ProjectorFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.111f, 12.0f)
                curveTo(11.566f, 14.004f, 13.358f, 15.5f, 15.5f, 15.5f)
                curveTo(17.642f, 15.5f, 19.434f, 14.004f, 19.889f, 12.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.552f, 21.552f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(11.111f)
                close()
                moveTo(5.0f, 16.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(16.0f)
                close()
                moveTo(15.5f, 13.5f)
                curveTo(14.119f, 13.5f, 13.0f, 12.381f, 13.0f, 11.0f)
                curveTo(13.0f, 9.619f, 14.119f, 8.5f, 15.5f, 8.5f)
                curveTo(16.881f, 8.5f, 18.0f, 9.619f, 18.0f, 11.0f)
                curveTo(18.0f, 12.381f, 16.881f, 13.5f, 15.5f, 13.5f)
                close()
                moveTo(11.111f, 10.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 3.0f, 22.0f, 3.448f, 22.0f, 4.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(19.889f)
                curveTo(19.434f, 7.996f, 17.642f, 6.5f, 15.5f, 6.5f)
                curveTo(13.358f, 6.5f, 11.566f, 7.996f, 11.111f, 10.0f)
                close()
            }
        }
        .build()
        return _projectorFill!!
    }

private var _projectorFill: ImageVector? = null

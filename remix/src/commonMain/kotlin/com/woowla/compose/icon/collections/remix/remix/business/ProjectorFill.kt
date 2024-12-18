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
                moveTo(3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 3.0f, 22.0f, 3.448f, 22.0f, 4.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(18.874f)
                curveTo(18.43f, 8.275f, 16.864f, 7.0f, 15.0f, 7.0f)
                curveTo(13.136f, 7.0f, 11.57f, 8.275f, 11.126f, 10.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(2.0f, 12.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 20.552f, 2.448f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 21.0f, 22.0f, 20.552f, 22.0f, 20.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.874f)
                curveTo(18.43f, 13.725f, 16.864f, 15.0f, 15.0f, 15.0f)
                curveTo(13.136f, 15.0f, 11.57f, 13.725f, 11.126f, 12.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(15.0f, 9.0f)
                curveTo(13.895f, 9.0f, 13.0f, 9.895f, 13.0f, 11.0f)
                curveTo(13.0f, 12.105f, 13.895f, 13.0f, 15.0f, 13.0f)
                curveTo(16.105f, 13.0f, 17.0f, 12.105f, 17.0f, 11.0f)
                curveTo(17.0f, 9.895f, 16.105f, 9.0f, 15.0f, 9.0f)
                close()
                moveTo(6.0f, 15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _projectorFill!!
    }

private var _projectorFill: ImageVector? = null

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

public val BusinessGroup.CreativeCommonsByFill: ImageVector
    get() {
        if (_creativeCommonsByFill != null) {
            return _creativeCommonsByFill!!
        }
        _creativeCommonsByFill = Builder(name = "CreativeCommonsByFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(14.0f, 10.0f)
                horizontalLineTo(10.0f)
                curveTo(9.448f, 10.0f, 9.0f, 10.448f, 9.0f, 11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.0f)
                curveTo(15.0f, 10.448f, 14.552f, 10.0f, 14.0f, 10.0f)
                close()
                moveTo(12.0f, 5.0f)
                curveTo(10.895f, 5.0f, 10.0f, 5.895f, 10.0f, 7.0f)
                curveTo(10.0f, 8.105f, 10.895f, 9.0f, 12.0f, 9.0f)
                curveTo(13.105f, 9.0f, 14.0f, 8.105f, 14.0f, 7.0f)
                curveTo(14.0f, 5.895f, 13.105f, 5.0f, 12.0f, 5.0f)
                close()
            }
        }
        .build()
        return _creativeCommonsByFill!!
    }

private var _creativeCommonsByFill: ImageVector? = null

package com.woowla.compose.icon.collections.remix.remix.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DocumentGroup

public val DocumentGroup.ContactsBook3Line: ImageVector
    get() {
        if (_contactsBook3Line != null) {
            return _contactsBook3Line!!
        }
        _contactsBook3Line = Builder(name = "ContactsBook3Line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                curveTo(3.448f, 2.0f, 3.0f, 2.448f, 3.0f, 3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(21.0f)
                curveTo(3.0f, 21.552f, 3.448f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 22.0f, 21.0f, 21.552f, 21.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(21.0f, 2.448f, 20.552f, 2.0f, 20.0f, 2.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(9.0f, 16.0f)
                curveTo(9.0f, 14.343f, 10.343f, 13.0f, 12.0f, 13.0f)
                curveTo(13.657f, 13.0f, 15.0f, 14.343f, 15.0f, 16.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveTo(10.895f, 12.0f, 10.0f, 11.105f, 10.0f, 10.0f)
                curveTo(10.0f, 8.895f, 10.895f, 8.0f, 12.0f, 8.0f)
                curveTo(13.105f, 8.0f, 14.0f, 8.895f, 14.0f, 10.0f)
                curveTo(14.0f, 11.105f, 13.105f, 12.0f, 12.0f, 12.0f)
                close()
                moveTo(6.0f, 9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(6.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(6.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _contactsBook3Line!!
    }

private var _contactsBook3Line: ImageVector? = null
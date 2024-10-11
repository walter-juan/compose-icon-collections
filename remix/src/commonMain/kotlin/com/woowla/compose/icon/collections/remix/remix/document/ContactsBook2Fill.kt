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

public val DocumentGroup.ContactsBook2Fill: ImageVector
    get() {
        if (_contactsBook2Fill != null) {
            return _contactsBook2Fill!!
        }
        _contactsBook2Fill = Builder(name = "ContactsBook2Fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(4.343f, 22.0f, 3.0f, 20.657f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.343f, 4.343f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 2.0f, 21.0f, 2.448f, 21.0f, 3.0f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.552f, 20.552f, 22.0f, 20.0f, 22.0f)
                close()
                moveTo(19.0f, 20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(6.0f)
                curveTo(5.448f, 18.0f, 5.0f, 18.448f, 5.0f, 19.0f)
                curveTo(5.0f, 19.552f, 5.448f, 20.0f, 6.0f, 20.0f)
                horizontalLineTo(19.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveTo(13.105f, 10.0f, 14.0f, 9.105f, 14.0f, 8.0f)
                curveTo(14.0f, 6.895f, 13.105f, 6.0f, 12.0f, 6.0f)
                curveTo(10.895f, 6.0f, 10.0f, 6.895f, 10.0f, 8.0f)
                curveTo(10.0f, 9.105f, 10.895f, 10.0f, 12.0f, 10.0f)
                close()
                moveTo(9.0f, 14.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 12.343f, 13.657f, 11.0f, 12.0f, 11.0f)
                curveTo(10.343f, 11.0f, 9.0f, 12.343f, 9.0f, 14.0f)
                close()
            }
        }
        .build()
        return _contactsBook2Fill!!
    }

private var _contactsBook2Fill: ImageVector? = null

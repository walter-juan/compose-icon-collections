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

public val DocumentGroup.ContactsBookLine: ImageVector
    get() {
        if (_contactsBookLine != null) {
            return _contactsBookLine!!
        }
        _contactsBookLine = Builder(name = "ContactsBookLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 2.0f)
                horizontalLineTo(19.005f)
                curveTo(20.107f, 2.0f, 21.0f, 2.898f, 21.0f, 3.991f)
                verticalLineTo(20.009f)
                curveTo(21.0f, 21.109f, 20.107f, 22.0f, 19.005f, 22.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(7.0f, 4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(9.0f, 20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(11.0f, 16.0f)
                curveTo(11.0f, 14.343f, 12.343f, 13.0f, 14.0f, 13.0f)
                curveTo(15.657f, 13.0f, 17.0f, 14.343f, 17.0f, 16.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(14.0f, 12.0f)
                curveTo(12.895f, 12.0f, 12.0f, 11.105f, 12.0f, 10.0f)
                curveTo(12.0f, 8.895f, 12.895f, 8.0f, 14.0f, 8.0f)
                curveTo(15.105f, 8.0f, 16.0f, 8.895f, 16.0f, 10.0f)
                curveTo(16.0f, 11.105f, 15.105f, 12.0f, 14.0f, 12.0f)
                close()
                moveTo(22.0f, 6.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(22.0f, 12.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _contactsBookLine!!
    }

private var _contactsBookLine: ImageVector? = null

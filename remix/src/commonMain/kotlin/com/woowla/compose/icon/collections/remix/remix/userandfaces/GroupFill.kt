package com.woowla.compose.icon.collections.remix.remix.userandfaces

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.UserAndFacesGroup

public val UserAndFacesGroup.GroupFill: ImageVector
    get() {
        if (_groupFill != null) {
            return _groupFill!!
        }
        _groupFill = Builder(name = "GroupFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 22.0f)
                curveTo(2.0f, 17.582f, 5.582f, 14.0f, 10.0f, 14.0f)
                curveTo(14.418f, 14.0f, 18.0f, 17.582f, 18.0f, 22.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(10.0f, 13.0f)
                curveTo(6.685f, 13.0f, 4.0f, 10.315f, 4.0f, 7.0f)
                curveTo(4.0f, 3.685f, 6.685f, 1.0f, 10.0f, 1.0f)
                curveTo(13.315f, 1.0f, 16.0f, 3.685f, 16.0f, 7.0f)
                curveTo(16.0f, 10.315f, 13.315f, 13.0f, 10.0f, 13.0f)
                close()
                moveTo(17.363f, 15.233f)
                curveTo(20.448f, 16.022f, 22.768f, 18.723f, 22.984f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 19.39f, 19.0f, 17.014f, 17.363f, 15.233f)
                close()
                moveTo(15.34f, 12.957f)
                curveTo(16.973f, 11.492f, 18.0f, 9.366f, 18.0f, 7.0f)
                curveTo(18.0f, 5.583f, 17.631f, 4.251f, 16.985f, 3.097f)
                curveTo(19.275f, 3.554f, 21.0f, 5.575f, 21.0f, 8.0f)
                curveTo(21.0f, 10.762f, 18.763f, 13.0f, 16.0f, 13.0f)
                curveTo(15.776f, 13.0f, 15.556f, 12.985f, 15.34f, 12.957f)
                close()
            }
        }
        .build()
        return _groupFill!!
    }

private var _groupFill: ImageVector? = null

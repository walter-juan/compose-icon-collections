package com.woowla.compose.icon.collections.remix.remix.communication

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.CommunicationGroup

public val CommunicationGroup.QuestionnaireLine: ImageVector
    get() {
        if (_questionnaireLine != null) {
            return _questionnaireLine!!
        }
        _questionnaireLine = Builder(name = "QuestionnaireLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.763f, 17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.385f)
                lineTo(5.763f, 17.0f)
                close()
                moveTo(6.455f, 19.0f)
                lineTo(2.0f, 22.5f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 3.0f, 22.0f, 3.448f, 22.0f, 4.0f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 18.552f, 21.552f, 19.0f, 21.0f, 19.0f)
                horizontalLineTo(6.455f)
                close()
                moveTo(11.0f, 14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(8.567f, 8.813f)
                curveTo(8.886f, 7.209f, 10.302f, 6.0f, 12.0f, 6.0f)
                curveTo(13.933f, 6.0f, 15.5f, 7.567f, 15.5f, 9.5f)
                curveTo(15.5f, 11.433f, 13.933f, 13.0f, 12.0f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(12.0f)
                curveTo(12.828f, 11.0f, 13.5f, 10.328f, 13.5f, 9.5f)
                curveTo(13.5f, 8.672f, 12.828f, 8.0f, 12.0f, 8.0f)
                curveTo(11.272f, 8.0f, 10.666f, 8.518f, 10.529f, 9.206f)
                lineTo(8.567f, 8.813f)
                close()
            }
        }
        .build()
        return _questionnaireLine!!
    }

private var _questionnaireLine: ImageVector? = null
